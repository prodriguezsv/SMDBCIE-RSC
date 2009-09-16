package ontology.common.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.common.*;

/**
* It's a subclass of a defined term
* Protege name: Attribute
* @author ontology bean generator
* @version 2009/09/16, 12:02:11
*/
public class DefaultAttribute implements Attribute, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = 50810507811552110L;

  private String _internalInstanceName = null;

  public DefaultAttribute() {
    this._internalInstanceName = "";
  }

  public DefaultAttribute(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: describedBy
   */
   private List describedBy = new ArrayList();
   public void addDescribedBy(Object elem) { 
     describedBy.add(elem);
     pcs.firePropertyChange("describedBy", oldList, this.describedBy);
   }
   public boolean removeDescribedBy(Object elem) {
     boolean result = describedBy.remove(elem);
     pcs.firePropertyChange("describedBy", oldList, this.describedBy);
     return result;
   }
   public void clearAllDescribedBy() {
     describedBy.clear();
     pcs.firePropertyChange("describedBy", oldList, this.describedBy);
   }
   public Iterator getAllDescribedBy() {return describedBy.iterator(); }
   public List getDescribedBy() {return describedBy; }
   public void setDescribedBy(List l) {describedBy = l; }

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
   * Protege name: apliesTo
   */
   private List apliesTo = new ArrayList();
   public void addApliesTo(Structure elem) { 
     apliesTo.add(elem);
     pcs.firePropertyChange("apliesTo", oldList, this.apliesTo);
   }
   public boolean removeApliesTo(Structure elem) {
     boolean result = apliesTo.remove(elem);
     pcs.firePropertyChange("apliesTo", oldList, this.apliesTo);
     return result;
   }
   public void clearAllApliesTo() {
     apliesTo.clear();
     pcs.firePropertyChange("apliesTo", oldList, this.apliesTo);
   }
   public Iterator getAllApliesTo() {return apliesTo.iterator(); }
   public List getApliesTo() {return apliesTo; }
   public void setApliesTo(List l) {apliesTo = l; }

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
