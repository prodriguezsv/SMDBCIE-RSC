package ontology.taxonomy.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.taxonomy.*;

/**
* Protege name: WeightedDescriptor
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public class DefaultWeightedDescriptor implements WeightedDescriptor, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -8627856865395943317L;

  private String _internalInstanceName = null;

  public DefaultWeightedDescriptor() {
    this._internalInstanceName = "";
  }

  public DefaultWeightedDescriptor(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: descriptor
   */
   private Descriptor descriptor;
   public void setDescriptor(Descriptor value) { 
     pcs.firePropertyChange("descriptor", (this.descriptor==null?new Descriptor():this.descriptor), value);
    this.descriptor=value;
   }
   public Descriptor getDescriptor() {
     return this.descriptor;
   }

   /**
   * Protege name: modifier
   */
   private Modifier modifier;
   public void setModifier(Modifier value) { 
     pcs.firePropertyChange("modifier", (this.modifier==null?new Modifier():this.modifier), value);
    this.modifier=value;
   }
   public Modifier getModifier() {
     return this.modifier;
   }

}
