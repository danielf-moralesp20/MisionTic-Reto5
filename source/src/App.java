import access.EscuelaDAO;
import view.MasterWindows2;

public class App {
	public static void main(String[] args) {
		System.out.println(new EscuelaDAO().findAll());
		new MasterWindows2().setVisible(true);
	}
}
