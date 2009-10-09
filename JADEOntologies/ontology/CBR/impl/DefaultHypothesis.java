package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: Hypothesis
* @author ontology bean generator
* @version 2009/10/7, 18:01:55
*/
public class DefaultHypothesis implements Hypothesis, Serializable {
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

  public DefaultHypothesis() {
    this._internalInstanceName = "";
  }

  public DefaultHypothesis(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: possibleSolutions
   */
   private List possibleSolutions = new ArrayList();
   public void addPossibleSolutions(PossibleSolution elem) { 
     possibleSolutions.add(elem);
     pcs.firePropertyChange("possibleSolutions", oldList, this.possibleSolutions);
   }
   public boolean removePossibleSolutions(PossibleSolution elem) {
     boolean result = possibleSolutions.remove(elem);
     pcs.firePropertyChange("possibleSolutions", oldList, this.possibleSolutions);
     return result;
   }
   public void clearAllPossibleSolutions() {
     possibleSolutions.clear();
     pcs.firePropertyChange("possibleSolutions", oldList, this.possibleSolutions);
   }
   public Iterator getAllPossibleSolutions() {return possibleSolutions.iterator(); }
   public List getPossibleSolutions() {return possibleSolutions; }
   public void setPossibleSolutions(List l) {possibleSolutions = l; }

   /**
   * Protege name: description
   */
   private Description description;
   public void setDescription(Description value) { 
     pcs.firePropertyChange("description", (this.description==null?new Description():this.description), value);
    this.description=value;
   }
   public Description getDescription() {
     return this.description;
   }

   /**
   * Protege name: justification
   */
   private Description justification;
   public void setJustification(Description value) { 
     pcs.firePropertyChange("justification", (this.justification==null?new Description():this.justification), value);
    this.justification=value;
   }
   public Description getJustification() {
     return this.justification;
   }

   /**
   * Protege name: unmatchedDescription
   */
   private Description unmatchedDescription;
   public void setUnmatchedDescription(Description value) { 
     pcs.firePropertyChange("unmatchedDescription", (this.unmatchedDescription==null?new Description():this.unmatchedDescription), value);
    this.unmatchedDescription=value;
   }
   public Description getUnmatchedDescription() {
     return this.unmatchedDescription;
   }

}
