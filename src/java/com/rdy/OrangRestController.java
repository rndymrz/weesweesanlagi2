/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdy;

import com.rdy.model.Alamat;
import com.rdy.model.Orang;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("api")
public class OrangRestController {
    
        @RequestMapping(value="/orangdenganalamat.json")
        public List<Orang> getOrangDenganAlamat() {
        List<Orang> semua = new ArrayList<>();
        Alamat alamat = new Alamat("Beverly Hills","Los Angeles");
        semua.add(new Orang("Brad Pitt", "Actor", new Date(), alamat));
        semua.add(new Orang("Jennifer Lopez", "Singer", new Date(), alamat));
        semua.add(new Orang("David Beckham", "Footballer", new Date(), alamat));
        return semua;
    }
    
    
}
