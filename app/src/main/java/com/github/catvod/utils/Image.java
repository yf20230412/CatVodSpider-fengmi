package com.github.catvod.utils;

public class Image {

    public static final String FOLDER = "data:image/png;base64,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";
    public static final String VIDEO = "data:image/png;base64,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";
    public static final String PUSH = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQEAYABgAAD/2wBDAAMCAgMCAgMDAwMEAwMEBQgFBQQEBQoHBwYIDAoMDAsKCwsNDhIQDQ4RDgsLEBYQERMUFRUVDA8XGBYUGBIUFRT/2wBDAQMEBAUEBQkFBQkUDQsNFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBT/wAARCADwAPADASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD9U6KKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACvN7bxhffFCaRPB+oWZ8KSQX1h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g74M+K1mbfxR4fs9UYLtS5ZNlxH/ALkq4dfoDitbp7mFmtjGvNNudPbbcQtH6NjIP41518fo5NY8G+FfAFsxS88da3DaTbSQy2ULCWdwRzwFX8GNTyfBX4nfCdd/w38bf8JHoqf8yx4w/ertzkrFcDkdwAQoHcml+F9n4v8AiP8AHCLxZ4w8H3Xg6Hwxop020sZ3WSF7yaQmWWGQcOvlhVyOOcZOKaVtbkt30seofFbVo/C/gCS2s9Y07w3dXTRabp9xqUBmt/NcgLEYwDuDKGXFdhptmun6fa2qrGiwRLEFhQRoAoAwqjhRxwB0p11ZW98ipcwRXCK6yKsqBgGByGGe4PQ1PUFhRRRSGFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAVhePP+RH8Rf9g64/9FNW7WD483HwN4i2RvK/9nXOI413Mx8puAO5NNbgfB/jX4kWV58A/hN8NZdQaw0u40+PVvEl1Dy0NjHI2yMdi7sPlU9XEQ/ir6Q+DPw1vPGOt6f8RfGGljTBZ262/hTwww/d6LZgAK7L/wA92ULk/wAIAHYBfFf2N/2XJtelsfiN47tWeKIRjR9LuoyN4jUIk8in+EBRsB643dMZ+6K1m0tEYwTerCiiisTYKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKAP/Z";

}
