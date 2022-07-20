Feature: Download PDF
  As a web user
  i need download a PDF
  to validate that is a report

  Scenario: Download PDF
    Given Andres enter the proveedores page in Bancolombia.com
    When he click on the "Políticas de tratamiento y de protección de datos personales de proveedores" button
    Then he validate the link "https://www.bancolombia.com/wps/wcm/connect/f7a3486a-41af-46b9-8157-2fde21fa4d0a/poli%CC%81ticas-tratamiento-y-proteccio%CC%81n-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf?MOD=AJPERES&CVID=l33Qn2Y"


