package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: Problem
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public interface Problem extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

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
