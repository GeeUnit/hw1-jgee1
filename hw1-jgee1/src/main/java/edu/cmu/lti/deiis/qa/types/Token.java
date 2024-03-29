/* First created by JCasGen Tue Sep 10 22:07:54 EDT 2013 */
package edu.cmu.lti.deiis.qa.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

/**
 * Annotation for the single token of a statement. Updated by JCasGen Tue Sep 10 22:11:21 EDT 2013
 * XML source: /home/jeff/workspace/11791/hw1-jgee1/src/main/resources/hw1-jgee1-typesystem.xml
 * 
 * @generated
 */
public class Token extends QAAnnotation {
  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);

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
  protected Token() {/* intentionally empty block */
  }

  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();
  }

  /** @generated */
  public Token(JCas jcas, int begin, int end) {
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

}
