/* First created by JCasGen Tue Sep 10 22:07:54 EDT 2013 */
package edu.cmu.lti.deiis.qa.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

/**
 * Annotation used to distinguish an Answer statement. Updated by JCasGen Tue Sep 10 22:11:21 EDT
 * 2013 XML source: /home/jeff/workspace/11791/hw1-jgee1/src/main/resources/hw1-jgee1-typesystem.xml
 * 
 * @generated
 */
public class Answer extends StatementBase {
  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);

  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int type = typeIndexID;

  /** @generated */
  @Override
  public int getTypeIndexID() {
    return typeIndexID;
  }

  /**
   * Never called. Disable default constructor
   * 
   * @generated
   */
  protected Answer() {/* intentionally empty block */
  }

  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();
  }

  /** @generated */
  public Answer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }

  /**
   * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
   * 
   * @generated modifiable
   */
  private void readObject() {/* default - does nothing empty block */
  }

  // *--------------*
  // * Feature: isCorrect

  /**
   * getter for isCorrect - gets boolean flag for trained data that signifies whether this answer is
   * correct (true) or incorrect (false).
   * 
   * @generated
   */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type) jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.deiis.qa.types.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type) jcasType).casFeatCode_isCorrect);
  }

  /**
   * setter for isCorrect - sets boolean flag for trained data that signifies whether this answer is
   * correct (true) or incorrect (false).
   * 
   * @generated
   */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type) jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.deiis.qa.types.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type) jcasType).casFeatCode_isCorrect, v);
  }
}
