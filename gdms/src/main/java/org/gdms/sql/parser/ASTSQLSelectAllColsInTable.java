/* Generated By:JJTree: Do not edit this line. ASTSQLSelectAllColsInTable.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.gdms.sql.parser;

public
class ASTSQLSelectAllColsInTable extends SimpleNode {
  public ASTSQLSelectAllColsInTable(int id) {
    super(id);
  }

  public ASTSQLSelectAllColsInTable(SQLEngine p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SQLEngineVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e55cb227370f10c11b7f60a0067b0375 (do not edit this line) */
