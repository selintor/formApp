package com.selin.formapp.controllers;

import com.selin.formapp.createWindow.entities.Create;
import com.selin.formapp.service.FormService;
import com.selin.formapp.repos.CreateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/forms")
@CrossOrigin
public class CreateController {
   /* @Autowired
    private FormService formService;
    private final CreateRepository createRepository;

    public CreateController(CreateRepository createRepository) {
        this.createRepository = createRepository;
    }

    @PostMapping("/add")
    public String add(@RequestBody Create create){
        formService.saveForm(create);
        return "New student is added";
    }
    @GetMapping
    public List<Create> list(){
        return formService.getAllForms();
    }
    @GetMapping("/{id}")
    public Create getCreate(@PathVariable Long id) {
        return createRepository.findById(id).orElseThrow(RuntimeException::new);
    }
*/
    private final CreateRepository createRepository;

    public CreateController(CreateRepository createRepository) {
        this.createRepository = createRepository;
    }

    @GetMapping
    public List<Create> getClients() {
        return createRepository.findAll();
    }

    @GetMapping("/{id}")
    public Create getCreate(@PathVariable Long id) {
        return createRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity createCreate(@RequestBody Create create) throws URISyntaxException {
        Create savedCreate = createRepository.save(create);
        return ResponseEntity.created(new URI("/forms/" + savedCreate.getId())).body(savedCreate);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCreate(@PathVariable Long id, @RequestBody Create create) {
        Create currentCreate = createRepository.findById(id).orElseThrow(RuntimeException::new);
        currentCreate.setFormName(create.getFormName());
        currentCreate.setFormDesc(create.getFormDesc());
        currentCreate.setQuestion(create.getQuestion());
        currentCreate.setQuestion2(create.getQuestion2());
        currentCreate.setQuestion3(create.getQuestion3());
        currentCreate.setQuestion4(create.getQuestion4());
        currentCreate.setQuestion5(create.getQuestion5());
        currentCreate = createRepository.save(create);

        return ResponseEntity.ok(currentCreate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCreate(@PathVariable Long id) {
        createRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
