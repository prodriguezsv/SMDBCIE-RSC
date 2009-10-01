package ontology.taxonomy;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: Taxon
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public interface Taxon extends jade.content.Concept, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: successors
   */
   public void addSuccessors(Taxon elem);
   public boolean removeSuccessors(Taxon elem);
   public void clearAllSuccessors();
   public Iterator getAllSuccessors();
   public List getSuccessors();
   public void setSuccessors(List l);

   /**
   * Protege name: predecessor
   */
   public void setPredecessor(Taxon value);
   public Taxon getPredecessor();

   /**
   * Protege name: level
   */
   public void setLevel(String value);
   public String getLevel();

   /**
   * Protege name: weightedDescription
   */
   public void setWeightedDescription(WeightedDescription value);
   public WeightedDescription getWeightedDescription();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

}
