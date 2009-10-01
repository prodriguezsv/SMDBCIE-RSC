package ontology.common.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.common.*;

/**
* Protege name: RangeValue
* @author ontology bean generator
* @version 2009/09/30, 12:55:43
*/
public class DefaultRangeValue implements RangeValue, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = 3978892154560758766L;

  private String _internalInstanceName = null;

  public DefaultRangeValue() {
    this._internalInstanceName = "";
  }

  public DefaultRangeValue(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
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

   /**
   * Protege name: upperBound
   */
   private float upperBound;
   public void setUpperBound(float value) { 
     pcs.firePropertyChange("upperBound", ""+this.upperBound, ""+value);
    this.upperBound=value;
   }
   public float getUpperBound() {
     return this.upperBound;
   }

   /**
   * Protege name: lowerBound
   */
   private float lowerBound;
   public void setLowerBound(float value) { 
     pcs.firePropertyChange("lowerBound", ""+this.lowerBound, ""+value);
    this.lowerBound=value;
   }
   public float getLowerBound() {
     return this.lowerBound;
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

}
