package launcher;
import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student estudiante = new Student(118463,"Coñoen Simon", "Lautaro","lautaro.conoen@gmail.com","https://github.com/cache11","/images/fotoEstudiante.png");
            	SimplePresentationScreen parteGrafica = new SimplePresentationScreen(estudiante);
            	parteGrafica.setVisible(true);
            }
        });
    }
}