package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: SingleValue
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public class DefaultSingleValue implements SingleValue, Serializable {
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

  public DefaultSingleValue() {
    this._internalInstanceName = "";
  }

  public DefaultSingleValue(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: measuringUnit
   */
   private String measuringUnit;
   public void setMeasuringUnit(String value) { 
     pcs.firePropertyChange("measuringUnit", (this.measuringUnit==null?new String():this.measuringUnit), value);
    this.measuringUnit=value;
   }
   public String getMeasuringUnit() {
     return this.measuringUnit;
   }

   /**
   * Protege name: value
   */
   private float value;
   public void setValue(float value) { 
     pcs.firePropertyChange("value", ""+this.value, ""+value);
    this.value=value;
   }
   public float getValue() {
     return this.value;
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
