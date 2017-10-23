package jordanmcpute.anusbot;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.powerbot.script.*;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.PollingScript;

@Script.Manifest(description = "The most useless script of the world", name = "Useless bot")
public class AnusBot extends PollingScript<ClientContext>{

	private List<Task> taskList = new ArrayList<Task>();

	@Override
	public void start() {
		System.out.println("Start connard lol");
		log.info("Startos");
		taskList.addAll(Arrays.asList(new Chop(ctx), new Drop(ctx)));
	}

	@Override
	public void poll() {
		for (Task task : taskList) {
			if (task.activate()) {
				task.execute();
			}
		}
	}
}