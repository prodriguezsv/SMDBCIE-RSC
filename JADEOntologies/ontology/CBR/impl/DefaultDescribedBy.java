package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: DescribedBy
* @author ontology bean generator
* @version 2009/10/7, 18:01:56
*/
public class DefaultDescribedBy implements DescribedBy, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -192457562360579226L;

  private String _internalInstanceName = null;

  public DefaultDescribedBy() {
    this._internalInstanceName = "";
  }

  public DefaultDescribedBy(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: score
   */
   private List score = new ArrayList();
   public void addScore(Object elem) { 
     score.add(elem);
     pcs.firePropertyChange("score", oldList, this.score);
   }
   public boolean removeScore(Object elem) {
     boolean result = score.remove(elem);
     pcs.firePropertyChange("score", oldList, this.score);
     return result;
   }
   public void clearAllScore() {
     score.clear();
     pcs.firePropertyChange("score", oldList, this.score);
   }
   public Iterator getAllScore() {return score.iterator(); }
   public List getScore() {return score; }
   public void setScore(List l) {score = l; }

   /**
   * Protege name: attribute
   */
   private Attribute attribute;
   public void setAttribute(Attribute value) { 
     pcs.firePropertyChange("attribute", (this.attribute==null?new Attribute():this.attribute), value);
    this.attribute=value;
   }
   public Attribute getAttribute() {
     return this.attribute;
   }

}
