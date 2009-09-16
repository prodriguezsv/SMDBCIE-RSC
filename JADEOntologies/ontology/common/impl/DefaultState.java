package ontology.common.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.common.*;

/**
* It's a subclass of a defined term
* Protege name: State
* @author ontology bean generator
* @version 2009/09/15, 18:06:25
*/
public class DefaultState implements State, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -2693500281773954763L;

  private String _internalInstanceName = null;

  public DefaultState() {
    this._internalInstanceName = "";
  }

  public DefaultState(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: definition
   */
   private String definition;
   public void setDefinition(String value) { 
     pcs.firePropertyChange("definition", (this.definition==null?new String():this.definition), value);
    this.definition=value;
   }
   public String getDefinition() {
     return this.definition;
   }

   /**
   * Protege name: term
   */
   private String term;
   public void setTerm(String value) { 
     pcs.firePropertyChange("term", (this.term==null?new String():this.term), value);
    this.term=value;
   }
   public String getTerm() {
     return this.term;
   }

   /**
   * Protege name: describes
   */
   private List describes = new ArrayList();
   public void addDescribes(Attribute elem) { 
     describes.add(elem);
     pcs.firePropertyChange("describes", oldList, this.describes);
   }
   public boolean removeDescribes(Attribute elem) {
     boolean result = describes.remove(elem);
     pcs.firePropertyChange("describes", oldList, this.describes);
     return result;
   }
   public void clearAllDescribes() {
     describes.clear();
     pcs.firePropertyChange("describes", oldList, this.describes);
   }
   public Iterator getAllDescribes() {return describes.iterator(); }
   public List getDescribes() {return describes; }
   public void setDescribes(List l) {describes = l; }

}
