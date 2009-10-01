package ontology.taxonomy.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.taxonomy.*;

/**
* Protege name: Value
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public class DefaultValue implements Value, Serializable {
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

  public DefaultValue() {
    this._internalInstanceName = "";
  }

  public DefaultValue(String instance_name) {
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
