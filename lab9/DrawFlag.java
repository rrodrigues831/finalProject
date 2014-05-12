/**
 * Created by 10a05 on 3/27/14.
 */

     

    import javafx.application.Application;
    import javafx.geometry.Point2D;
    import javafx.scene.Scene;
    import javafx.scene.canvas.Canvas;
    import javafx.scene.canvas.GraphicsContext;
    import javafx.scene.layout.BorderPane;
    import javafx.scene.shape.Rectangle;
    import javafx.stage.Stage;

    public class DrawFlag extends Application {

        public static void main(String[] args) {
            // 'launch' is a method that is inherited from 'Application'
            launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {
            stage.setTitle("Drawing Operations Test");
            // Use Border pane to center content
            BorderPane pane = new BorderPane();
            Canvas canvas = new Canvas(800, 500); // canvas is what we draw our pictures on
            pane.setCenter(canvas);               // add orderPane so it resizes correctly
            GraphicsContext gc = canvas.getGraphicsContext2D();
            draw(gc);
            stage.setScene(new Scene(pane));
            stage.show();                         // Display the stage on the screen
        }

        public void draw(GraphicsContext g) {
            // draw a filled rectangle
            g.fillRect(50, 100, 20, 40);          // 20x40 at upper left corner (50,100)
        }

        public static Point2D findCenter(Rectangle rect) {
            double x = rect.getX() + rect.getWidth() / 2;
            double y = rect.getY() + rect.getHeight() / 2;
            return new Point2D(x, y);
        }
    }
}
