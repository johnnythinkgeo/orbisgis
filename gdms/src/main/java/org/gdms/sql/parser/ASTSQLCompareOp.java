/* Generated By:JJTree: Do not edit this line. ASTSQLCompareOp.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.gdms.sql.parser;

public
class ASTSQLCompareOp extends SimpleNode {
  public ASTSQLCompareOp(int id) {
    super(id);
  }

  public ASTSQLCompareOp(SQLEngine p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SQLEngineVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=feb8b1c4b93911ec2f6131cd3509a62b (do not edit this line) */
