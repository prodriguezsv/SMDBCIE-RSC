package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: PossibleSolution
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface PossibleSolution extends jade.content.Concept, Introspectable {

   /**
   * Protege name: unconfirmedDescription
   */
   public void setUnconfirmedDescription(Description value);
   public Description getUnconfirmedDescription();

   /**
   * Protege name: points
   */
   public void setPoints(float value);
   public float getPoints();

   /**
   * Protege name: doubtfulDescription
   */
   public void setDoubtfulDescription(Description value);
   public Description getDoubtfulDescription();

   /**
   * Protege name: solutionDescription
   */
   public void setSolutionDescription(Description value);
   public Description getSolutionDescription();

   /**
   * Protege name: confirmedDescription
   */
   public void setConfirmedDescription(Description value);
   public Description getConfirmedDescription();

   /**
   * Protege name: possibleSolution
   */
   public void setPossibleSolution(Object value);
   public Object getPossibleSolution();

   /**
   * Protege name: contradictions
   */
   public void setContradictions(Description value);
   public Description getContradictions();

}
