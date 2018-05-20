package util {
import mx.core.FlexGlobals;
import mx.messaging.ChannelSet;
import mx.messaging.channels.AMFChannel;

import spark.components.Application;

public class ROUtil {

    private static var _channelSet:ChannelSet;

    public static function get channelSet():ChannelSet {
        if (_channelSet == null) {
            var context:String = obtenerContexto();
            _channelSet = new ChannelSet();
            _channelSet.addChannel(new AMFChannel("graniteamf",
                            "http://{server.name}:{server.port}/" + context + "/graniteamf/amf"));
        }
        return _channelSet;
    }

    private static function obtenerContexto():String {
        var url:String = (FlexGlobals.topLevelApplication as Application).url;
        var urlPattern:RegExp = /.+:\/\/(.+)\/(.+)\/.+/;
        return url.replace(urlPattern, "$2");
    }
}
}
