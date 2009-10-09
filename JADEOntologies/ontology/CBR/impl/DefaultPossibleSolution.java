package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: PossibleSolution
* @author ontology bean generator
* @version 2009/10/7, 18:01:54
*/
public class DefaultPossibleSolution implements PossibleSolution, Serializable {
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

  public DefaultPossibleSolution() {
    this._internalInstanceName = "";
  }

  public DefaultPossibleSolution(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: confirmedDescription
   */
   private Description confirmedDescription;
   public void setConfirmedDescription(Description value) { 
     pcs.firePropertyChange("confirmedDescription", (this.confirmedDescription==null?new Description():this.confirmedDescription), value);
    this.confirmedDescription=value;
   }
   public Description getConfirmedDescription() {
     return this.confirmedDescription;
   }

   /**
   * Protege name: contradictions
   */
   private Description contradictions;
   public void setContradictions(Description value) { 
     pcs.firePropertyChange("contradictions", (this.contradictions==null?new Description():this.contradictions), value);
    this.contradictions=value;
   }
   public Description getContradictions() {
     return this.contradictions;
   }

   /**
   * Protege name: solutionDescription
   */
   private Description solutionDescription;
   public void setSolutionDescription(Description value) { 
     pcs.firePropertyChange("solutionDescription", (this.solutionDescription==null?new Description():this.solutionDescription), value);
    this.solutionDescription=value;
   }
   public Description getSolutionDescription() {
     return this.solutionDescription;
   }

   /**
   * Protege name: possibleSolution
   */
   private Object possibleSolution;
   public void setPossibleSolution(Object value) { 
     pcs.firePropertyChange("possibleSolution", (this.possibleSolution==null?new Object():this.possibleSolution), value);
    this.possibleSolution=value;
   }
   public Object getPossibleSolution() {
     return this.possibleSolution;
   }

   /**
   * Protege name: doubtfulDescription
   */
   private Description doubtfulDescription;
   public void setDoubtfulDescription(Description value) { 
     pcs.firePropertyChange("doubtfulDescription", (this.doubtfulDescription==null?new Description():this.doubtfulDescription), value);
    this.doubtfulDescription=value;
   }
   public Description getDoubtfulDescription() {
     return this.doubtfulDescription;
   }

   /**
   * Protege name: points
   */
   private float points;
   public void setPoints(float value) { 
     pcs.firePropertyChange("points", ""+this.points, ""+value);
    this.points=value;
   }
   public float getPoints() {
     return this.points;
   }

   /**
   * Protege name: unconfirmedDescription
   */
   private Description unconfirmedDescription;
   public void setUnconfirmedDescription(Description value) { 
     pcs.firePropertyChange("unconfirmedDescription", (this.unconfirmedDescription==null?new Description():this.unconfirmedDescription), value);
    this.unconfirmedDescription=value;
   }
   public Description getUnconfirmedDescription() {
     return this.unconfirmedDescription;
   }

}
