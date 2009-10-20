package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: Case
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Case extends jade.content.Concept, Introspectable {

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

   /**
   * Protege name: state
   */
   public void setState(boolean value);
   public boolean getState();

   /**
   * Protege name: solution
   */
   public void setSolution(Solution value);
   public Solution getSolution();

}
