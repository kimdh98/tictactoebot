package demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicTacToeController {

	@GetMapping("/tictactoe")
	public String greeting() {
		return "tictactoe";
	}

}