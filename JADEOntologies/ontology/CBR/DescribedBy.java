package ontology.CBR;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;

/**
* Protege name: DescribedBy
* @author ontology bean generator
* @version 2009/10/7, 18:01:56
*/
public interface DescribedBy extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: score
   */
   public void addScore(Object elem);
   public boolean removeScore(Object elem);
   public void clearAllScore();
   public Iterator getAllScore();
   public List getScore();
   public void setScore(List l);

   /**
   * Protege name: attribute
   */
   public void setAttribute(Attribute value);
   public Attribute getAttribute();

}
