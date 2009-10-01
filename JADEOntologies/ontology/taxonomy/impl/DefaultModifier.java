package ontology.taxonomy.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.taxonomy.*;

/**
* Protege name: Modifier
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public class DefaultModifier implements Modifier, Serializable {
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

  public DefaultModifier() {
    this._internalInstanceName = "";
  }

  public DefaultModifier(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: attributeWeight
   */
   private float attributeWeight;
   public void setAttributeWeight(float value) { 
     pcs.firePropertyChange("attributeWeight", ""+this.attributeWeight, ""+value);
    this.attributeWeight=value;
   }
   public float getAttributeWeight() {
     return this.attributeWeight;
   }

   /**
   * Protege name: structureWeight
   */
   private float structureWeight;
   public void setStructureWeight(float value) { 
     pcs.firePropertyChange("structureWeight", ""+this.structureWeight, ""+value);
    this.structureWeight=value;
   }
   public float getStructureWeight() {
     return this.structureWeight;
   }

   /**
   * Protege name: scoreWeight
   */
   private float scoreWeight;
   public void setScoreWeight(float value) { 
     pcs.firePropertyChange("scoreWeight", ""+this.scoreWeight, ""+value);
    this.scoreWeight=value;
   }
   public float getScoreWeight() {
     return this.scoreWeight;
   }

}
