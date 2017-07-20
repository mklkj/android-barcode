# android-barcode
      
Simple Android Barcode generator
- Code 128 [Wiki](http://en.wikipedia.org/wiki/Code_128)
- International Article Number [Wiki](http://en.wikipedia.org/wiki/International_Article_Number_(EAN))

Usage:
```
private void drawBarcode() {
   String barcode = "7761010114033430";
   Code128 code = new Code128(this);
   code.setData(barcode);
   Bitmap bitmap = code.getBitmap(680, 300);
   ImageView ivBarcode = (ImageView) findViewById(R.id.code128_barcode);
   ivBarcode.setImageBitmap(bitmap);
}
```
