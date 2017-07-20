# android-barcode
      
## Simple Android Barcode generator
- Code 128 [Wiki](http://en.wikipedia.org/wiki/Code_128)
- International Article Number [Wiki](http://en.wikipedia.org/wiki/International_Article_Number_(EAN))

## How to
To get a Git project into your build:
### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2. Add the dependency
```groovy
dependencies {
    compile 'com.github.ohjongin:android-barcode:1.0.1'
}
```

## Usage:
```java
private void drawBarcode() {
   String barcode = "7761010114033430";
   Code128 code = new Code128(this);
   code.setData(barcode);
   Bitmap bitmap = code.getBitmap(680, 300);
   ImageView ivBarcode = (ImageView) findViewById(R.id.code128_barcode);
   ivBarcode.setImageBitmap(bitmap);
}
```
