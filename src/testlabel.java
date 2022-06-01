import Animals.Animal;
import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class testlabel extends ApplicationFrame {
   
   public testlabel( String myApplicationName , String myChartName ) {
      super(myApplicationName );        
      JFreeChart barChart = ChartFactory.createBarChart(myChartName,           
         "Gender",            
         "Friends",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String male = "Male";        
      final String Female = "Female";        
    //  final String ford = "FORD";        
      //final String speed = "Speed";        
     // final String millage = "Millage";        
     // final String userrating = "User Rating";        
     // final String safety = "safety";        
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  

      Graph<Animal> graph = Filehandlers.GetFromFile();
      double maleFriends = 0;
      double femaleFriends = 0;
      double totalFriends = 0;
      for(Edge<Animal> g: graph.getEdges())
      {
      
          if(g.getFromVertex().getValue().getGender().equals("Male"))
          {
          maleFriends += 1;
          }
          else
          {
          femaleFriends+=1;
          }
          
          totalFriends+=1;
      }
      dataset.addValue(maleFriends , male , "Male" );        
     // dataset.addValue(3.0 , male , userrating );        
     // dataset.addValue(5.0 , male , millage ); 
     // dataset.addValue(5.0 , male , safety );           

      dataset.addValue(femaleFriends , Female , "Female" );        
    //  dataset.addValue(6.0 , Female , userrating );       
    //  dataset.addValue(10.0 , Female , millage );        
    //  dataset.addValue(4.0 , Female , safety );

     // dataset.addValue( 4.0 , ford , speed );        
     // dataset.addValue( 2.0 , ford , userrating );        
     // dataset.addValue( 3.0 , ford , millage );        
     // dataset.addValue( 6.0 , ford , safety );               

      return dataset; 
   }
   
   public static void main( String[ ] args ) {
      testlabel chart = new testlabel("Friendship statistics", 
         "Likelihood of being picked as friend based on gender");
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
   }
}