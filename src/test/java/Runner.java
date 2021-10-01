import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions (
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE, //faz com que a escrita do Gerkin tenha espaco e nao underline
		dryRun = false, // imprime o texto do System.out QUALQUER COISA
		strict = true // quando tem um ent�o que n�o foi definido e deseja que ele n�o rode "false"
		)

public class Runner {

}
