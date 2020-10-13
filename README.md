# Library-Catalog
High-level Specifications:
- The system should have 4 functionalities:
    Add Catalog Card, Edit Catalog Card, Remove Catalog Card, View Catalog Card.
- User should have the option to view either a single catalog card or the entire catalogue (sorted).

Technical Specifications:
- There should be a class CatalogCard with the following attributes:
    *cardID 
    *bookTitle 
    *bookAuthor 
    *yearPublished 
    *publisher 
- Every time a catalog is added, it should be sorted by Card ID and stored in a list.
- Encapsulation should be implemented (Implement getters and setters)

Might be helpful:
- ArrayList&lt;CatalogCard> cat = new ArrayList&lt;CatalogCard>();
- Collections.sort();
