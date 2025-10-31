package example.java.core.sealed;

/**
 * Kiểm soát extend/implement các class
 */
public sealed abstract class FileProcessor permits PdfProcessor, ImageProcessor, TextProcessor {
}

final class PdfProcessor extends FileProcessor {
}

final class ImageProcessor extends FileProcessor {
}

non-sealed class TextProcessor extends FileProcessor {
}