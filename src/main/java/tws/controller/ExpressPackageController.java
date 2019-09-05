package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.ExpressPackage;
import tws.repository.ExpressPackageMapper;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/express")
public class ExpressPackageController {
    @Autowired
    private ExpressPackageMapper expressPackageMapper;

    @GetMapping("")
    @CrossOrigin
    public ResponseEntity<List<ExpressPackage>> getAll(){
        return ResponseEntity.ok(expressPackageMapper.selectAll());
    }

    @PostMapping("")
    @CrossOrigin
    public ResponseEntity<ExpressPackage> insert(@RequestBody ExpressPackage expressPackage) {
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        expressPackage.setDate(dateFormat.format(new Date()));
        expressPackageMapper.insert(expressPackage);
        return ResponseEntity.created(URI.create("/expressPackage/" + expressPackage.getId())).body(expressPackage);
    }
}
