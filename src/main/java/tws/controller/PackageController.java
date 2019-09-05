package tws.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.PackageInfo;
import tws.repository.PackageMapper;
@CrossOrigin
@RestController
@RequestMapping("/packages")
public class PackageController {
	@Autowired
	PackageMapper packageMapper;
	@PostMapping("")
    public PackageInfo insert(@RequestBody PackageInfo onePackage) {
		packageMapper.insert(onePackage);
        return onePackage;
    }
}
