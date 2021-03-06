/* Generated By:JJTree&JavaCC: Do not edit this line. XParserConstants.java */
package org.w3c.xqparser;

public interface XParserConstants {

  int EOF = 0;
  int DirCommentContentDoubleDashError = 177;
  int RbraceError = 178;
  int LeftAngleBracketError = 179;
  int AmpersandError = 180;
  int PITargetError = 181;
  int NumericLiteralError = 182;
  int Slash = 183;
  int SlashSlash = 184;
  int Greatest = 185;
  int Least = 186;
  int External = 187;
  int Lbrace = 188;
  int Rbrace = 189;
  int Ascending = 190;
  int Descending = 191;
  int LeftAngleBracket = 192;
  int Plus = 193;
  int Minus = 194;
  int PragmaOpen = 195;
  int PragmaClose = 196;
  int NCNameColonStar = 197;
  int StarColonNCName = 198;
  int TagQName = 199;
  int StartTagClose = 200;
  int EmptyTagClose = 201;
  int EndTagOpen = 202;
  int EndTagQName = 203;
  int EndTagClose = 204;
  int ValueIndicator = 205;
  int OpenQuot = 206;
  int CloseQuot = 207;
  int OpenApos = 208;
  int CloseApos = 209;
  int LCurlyBraceEscape = 210;
  int RCurlyBraceEscape = 211;
  int DirCommentStart = 212;
  int DirCommentEnd = 213;
  int DirCommentContentChar = 214;
  int DirCommentContentDashChar = 215;
  int ProcessingInstructionStart = 216;
  int ProcessingInstructionEnd = 217;
  int CdataSectionStart = 218;
  int CdataSectionEnd = 219;
  int IntegerLiteral = 220;
  int DecimalLiteral = 221;
  int DoubleLiteral = 222;
  int StringLiteral = 223;
  int PredefinedEntityRef = 224;
  int EscapeQuot = 225;
  int EscapeApos = 226;
  int ElementContentChar = 227;
  int QuotAttrContentChar = 228;
  int AposAttrContentChar = 229;
  int PITarget = 230;
  int CharRef = 231;
  int QNameToken = 232;
  int NCNameTok = 233;
  int S = 234;
  int Char = 235;
  int Digits = 236;
  int HexDigits = 237;
  int WhitespaceChar = 238;
  int LocalPart = 239;
  int Nmstart = 240;
  int Nmchar = 241;
  int Letter = 242;
  int BaseChar = 243;
  int Ideographic = 244;
  int CombiningChar = 245;
  int Digit = 246;
  int Extender = 247;
  int CommentStart = 248;
  int CommentEnd = 249;
  int CommentContent = 250;
  int ImplicitlyAllowedWhitespace = 251;

  int DEFAULT = 0;
  int XML_COMMENT = 1;
  int QUOT_ATTRIBUTE_CONTENT = 2;
  int APOS_ATTRIBUTE_CONTENT = 3;
  int ELEMENT_CONTENT = 4;
  int PROCESSING_INSTRUCTION = 5;
  int PRAGMA_2 = 6;
  int PRAGMA_3 = 7;
  int START_TAG = 8;
  int END_TAG = 9;
  int PROCESSING_INSTRUCTION_CONTENT = 10;
  int CDATA_SECTION = 11;
  int PRAGMA_1 = 12;
  int EXPR_COMMENT = 13;

  String[] tokenImage = {
    "<EOF>",
    "\"%%%\"",
    "\"xquery\"",
    "\"version\"",
    "\"encoding\"",
    "\"module\"",
    "\"namespace\"",
    "\"=\"",
    "\";\"",
    "\"declare\"",
    "\"boundary-space\"",
    "\"preserve\"",
    "\"strip\"",
    "\"default\"",
    "\"collation\"",
    "\"base-uri\"",
    "\"construction\"",
    "\"ordering\"",
    "\"ordered\"",
    "\"unordered\"",
    "\"order\"",
    "\"empty\"",
    "\"copy-namespaces\"",
    "\",\"",
    "\"no-preserve\"",
    "\"inherit\"",
    "\"no-inherit\"",
    "\"import\"",
    "\"schema\"",
    "\"at\"",
    "\"element\"",
    "\"function\"",
    "\"ft-option\"",
    "\"variable\"",
    "\"$\"",
    "\":=\"",
    "\"updating\"",
    "\"(\"",
    "\")\"",
    "\"as\"",
    "\"option\"",
    "\"return\"",
    "\"for\"",
    "\"in\"",
    "\"score\"",
    "\"let\"",
    "\"where\"",
    "\"by\"",
    "\"stable\"",
    "\"some\"",
    "\"every\"",
    "\"satisfies\"",
    "\"typeswitch\"",
    "\"case\"",
    "\"if\"",
    "\"then\"",
    "\"else\"",
    "\"or\"",
    "\"and\"",
    "\"contains\"",
    "\"text\"",
    "\"to\"",
    "\"*\"",
    "\"div\"",
    "\"idiv\"",
    "\"mod\"",
    "\"union\"",
    "\"|\"",
    "\"intersect\"",
    "\"except\"",
    "\"instance\"",
    "\"of\"",
    "\"treat\"",
    "\"castable\"",
    "\"cast\"",
    "\"!=\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"eq\"",
    "\"ne\"",
    "\"lt\"",
    "\"le\"",
    "\"gt\"",
    "\"ge\"",
    "\"is\"",
    "\"<<\"",
    "\">>\"",
    "\"validate\"",
    "\"lax\"",
    "\"strict\"",
    "\"child\"",
    "\"::\"",
    "\"descendant\"",
    "\"attribute\"",
    "\"self\"",
    "\"descendant-or-self\"",
    "\"following-sibling\"",
    "\"following\"",
    "\"@\"",
    "\"parent\"",
    "\"ancestor\"",
    "\"preceding-sibling\"",
    "\"preceding\"",
    "\"ancestor-or-self\"",
    "\"..\"",
    "\"[\"",
    "\"]\"",
    "\".\"",
    "\"document\"",
    "\"comment\"",
    "\"processing-instruction\"",
    "\"?\"",
    "\"empty-sequence\"",
    "\"item\"",
    "\"node\"",
    "\"document-node\"",
    "\"schema-attribute\"",
    "\"schema-element\"",
    "\"weight\"",
    "\"ftor\"",
    "\"ftand\"",
    "\"not\"",
    "\"ftnot\"",
    "\"any\"",
    "\"word\"",
    "\"all\"",
    "\"words\"",
    "\"phrase\"",
    "\"occurs\"",
    "\"times\"",
    "\"exactly\"",
    "\"most\"",
    "\"from\"",
    "\"window\"",
    "\"distance\"",
    "\"sentences\"",
    "\"paragraphs\"",
    "\"same\"",
    "\"different\"",
    "\"sentence\"",
    "\"paragraph\"",
    "\"start\"",
    "\"end\"",
    "\"entire\"",
    "\"content\"",
    "\"using\"",
    "\"insensitive\"",
    "\"sensitive\"",
    "\"lowercase\"",
    "\"uppercase\"",
    "\"diacritics\"",
    "\"stemming\"",
    "\"no\"",
    "\"thesaurus\"",
    "\"relationship\"",
    "\"levels\"",
    "\"stop\"",
    "\"language\"",
    "\"wildcards\"",
    "\"without\"",
    "\"revalidation\"",
    "\"skip\"",
    "\"first\"",
    "\"last\"",
    "\"into\"",
    "\"after\"",
    "\"before\"",
    "\"insert\"",
    "\"nodes\"",
    "\"delete\"",
    "\"replace\"",
    "\"value\"",
    "\"with\"",
    "\"rename\"",
    "\"copy\"",
    "\"modify\"",
    "<DirCommentContentDoubleDashError>",
    "\"}\"",
    "\"<\"",
    "\"&\"",
    "<PITargetError>",
    "<NumericLiteralError>",
    "\"/\"",
    "\"//\"",
    "\"greatest\"",
    "\"least\"",
    "\"external\"",
    "\"{\"",
    "\"}\"",
    "\"ascending\"",
    "\"descending\"",
    "\"<\"",
    "\"+\"",
    "\"-\"",
    "\"(#\"",
    "\"#)\"",
    "<NCNameColonStar>",
    "<StarColonNCName>",
    "<TagQName>",
    "\">\"",
    "\"/>\"",
    "\"</\"",
    "<EndTagQName>",
    "\">\"",
    "\"=\"",
    "\"\\\"\"",
    "\"\\\"\"",
    "\"\\\'\"",
    "\"\\\'\"",
    "\"{{\"",
    "\"}}\"",
    "\"<!--\"",
    "\"-->\"",
    "<DirCommentContentChar>",
    "<DirCommentContentDashChar>",
    "\"<?\"",
    "\"?>\"",
    "\"<![CDATA[\"",
    "<CdataSectionEnd>",
    "<IntegerLiteral>",
    "<DecimalLiteral>",
    "<DoubleLiteral>",
    "<StringLiteral>",
    "<PredefinedEntityRef>",
    "\"\\\"\\\"\"",
    "\"\\\'\\\'\"",
    "<ElementContentChar>",
    "<QuotAttrContentChar>",
    "<AposAttrContentChar>",
    "<PITarget>",
    "<CharRef>",
    "<QNameToken>",
    "<NCNameTok>",
    "<S>",
    "<Char>",
    "<Digits>",
    "<HexDigits>",
    "<WhitespaceChar>",
    "<LocalPart>",
    "<Nmstart>",
    "<Nmchar>",
    "<Letter>",
    "<BaseChar>",
    "<Ideographic>",
    "<CombiningChar>",
    "<Digit>",
    "<Extender>",
    "\"(:\"",
    "\":)\"",
    "<CommentContent>",
    "<ImplicitlyAllowedWhitespace>",
  };

}
