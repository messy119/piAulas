package ifrn.pi.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventosRepository;

@Controller
public class EventosController {
		
		@Autowired
		private EventosRepository er;
	
		@RequestMapping("/eventos/form")
		public String form() {
			return "eventos/formEvento";
		}
		
		@PostMapping("/eventos")
		public String adicionar (Evento evento) {
			System.out.print(evento);
			er.save(evento);
			return  "eventos/evento-adicionado";
		}
}
