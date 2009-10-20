package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.CBR.*;

/**
* It's a subclass of a defined term
* Protege name: Structure
* @author ontology bean generator
* @version 2009/10/17, 19:00:45
*/
public class DefaultStructure implements Structure, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = 1907932705116471396L;

  private String _internalInstanceName = null;

  public DefaultStructure() {
    this._internalInstanceName = "";
  }

  public DefaultStructure(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: owns
   */
   private List owns = new ArrayList();
   public void addOwns(Attribute elem) { 
     owns.add(elem);
     pcs.firePropertyChange("owns", oldList, this.owns);
   }
   public boolean removeOwns(Attribute elem) {
     boolean result = owns.remove(elem);
     pcs.firePropertyChange("owns", oldList, this.owns);
     return result;
   }
   public void clearAllOwns() {
     owns.clear();
     pcs.firePropertyChange("owns", oldList, this.owns);
   }
   public Iterator getAllOwns() {return owns.iterator(); }
   public List getOwns() {return owns; }
   public void setOwns(List l) {owns = l; }

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

}
