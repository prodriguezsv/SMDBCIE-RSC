package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: Problem
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Problem extends jade.content.Concept, Introspectable {

   /**
   * Protege name: goalRank
   */
   public void setGoalRank(String value);
   public String getGoalRank();

   /**
   * Protege name: description
   */
   public void setDescription(Description value);
   public Description getDescription();

   /**
   * Protege name: leastSimilarityDegree
   */
   public void setLeastSimilarityDegree(String value);
   public String getLeastSimilarityDegree();

}
