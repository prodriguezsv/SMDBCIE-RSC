package ontology.common.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.common.*;

/**
* Protege name: ApliesTo
* @author ontology bean generator
* @version 2009/09/16, 12:02:11
*/
public class DefaultApliesTo implements ApliesTo, Serializable {
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

  public DefaultApliesTo() {
    this._internalInstanceName = "";
  }

  public DefaultApliesTo(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

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

   /**
   * Protege name: descriptiveElement
   */
   private Object descriptiveElement;
   public void setDescriptiveElement(Object value) { 
     pcs.firePropertyChange("descriptiveElement", (this.descriptiveElement==null?new Object():this.descriptiveElement), value);
    this.descriptiveElement=value;
   }
   public Object getDescriptiveElement() {
     return this.descriptiveElement;
   }

}
