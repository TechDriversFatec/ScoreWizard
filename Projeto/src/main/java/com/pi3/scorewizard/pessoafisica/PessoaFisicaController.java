package com.pi3.scorewizard.pessoafisica;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/pessoafisica")
public class PessoaFisicaController {

	@Autowired
	private PessoaFisicaRepository pessoafisicarepository;
	
	@PostMapping(path="/addpessoaf")
    public @ResponseBody String addPessoaFisica (@RequestParam int docCli,
                                            @RequestParam char sexo,
                                            @RequestParam Date date,
                                            @RequestParam String cidade,
                                            @RequestParam String estado) {

      PessoaFisica pesf = new PessoaFisica(docCli, sexo, date, cidade, estado);
      
      PessoaFisicaRepository.save(pesf);
      return "Saved";
    }
	
    @GetMapping(path="/getPessoaFisica")
    public @ResponseBody ArrayList<PessoaFisica> getAllPessoaFisica() {
        return PessoaFisicaRepository.findAll();
    }
}
