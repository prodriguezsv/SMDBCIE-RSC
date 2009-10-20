package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: Taxon
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public interface Taxon extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: level
   */
   public void setLevel(String value);
   public String getLevel();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: weightedDescription
   */
   public void setWeightedDescription(WeightedDescription value);
   public WeightedDescription getWeightedDescription();

   /**
   * Protege name: predecessor
   */
   public void setPredecessor(Taxon value);
   public Taxon getPredecessor();

   /**
   * Protege name: successors
   */
   public void addSuccessors(Taxon elem);
   public boolean removeSuccessors(Taxon elem);
   public void clearAllSuccessors();
   public Iterator getAllSuccessors();
   public List getSuccessors();
   public void setSuccessors(List l);

}
