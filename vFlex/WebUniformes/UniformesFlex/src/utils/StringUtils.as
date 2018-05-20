package utils {

import spark.components.gridClasses.GridColumn;
import spark.formatters.CurrencyFormatter;
import spark.formatters.DateTimeFormatter;

public class StringUtils {
    private static var _cf:CurrencyFormatter = new CurrencyFormatter();
    private static var _df:DateTimeFormatter = new DateTimeFormatter();

    {
        _cf.positiveCurrencyFormat = 0;
        _cf.negativeCurrencyFormat = 0;
        _cf.useCurrencySymbol = true;
        _cf.currencySymbol = "$";

        _df.dateTimePattern = "dd/MMM/yyyy";
        _df.setStyle("locale", "es-MX");
    }

    public static function get cf():CurrencyFormatter {
        return _cf;
    }

    public static function get df():DateTimeFormatter {
        return _df;
    }

    public static function currencyFormat(value:Number):String {
        if (value == 0) {
            return "$0.00";
        } else {
            return _cf.format(value);
        }

    }

    public static function currencyFormatColumn(item:Object, column:GridColumn):String {
        return currencyFormat(item[column.dataField]);
    }

    public static function dateFormatGridColumn(item:Object, column:GridColumn):String {
        return _df.format(item[column.dataField]);
    }

    public static function capitalizeDataGridColumn(item:Object, column:GridColumn):String {
        return StringUtils.capitalize(item[column.dataField]);
    }

    public static function capitalize(str:String):String {
        if (str == null) {
            return null;
        }
        var wordsArray:Array = str.toLowerCase().split(" ");
        for (var a:String in wordsArray) {
            if (wordsArray.hasOwnProperty(a)) {
                wordsArray[a] = String(wordsArray[a]).charAt(0).toUpperCase() + String(wordsArray[a]).substr(1, String(wordsArray[a]).length);
            }
        }
        return wordsArray.join(" ");
    }
}
}
