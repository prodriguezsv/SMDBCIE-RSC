package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: ProposedSolution
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface ProposedSolution extends jade.content.Concept, Introspectable {

   /**
   * Protege name: state
   */
   public void setState(boolean value);
   public boolean getState();

   /**
   * Protege name: evaluatedSolution
   */
   public void setEvaluatedSolution(PossibleSolution value);
   public PossibleSolution getEvaluatedSolution();

   /**
   * Protege name: certaintyDegree
   */
   public void setCertaintyDegree(String value);
   public String getCertaintyDegree();

}
