package GithubActions.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {
	@GetMapping("/welcome")
	public String Welcome(){
		return "welocme to javatechie";
	}
	//echo "# githubactionspro" >> README.md
	//git init
	//git add README.md
	//git commit -m "first commit"
	//git branch -M main
	//git remote add origin https://github.com/johnvali112/githubactionspro.git
	//git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
