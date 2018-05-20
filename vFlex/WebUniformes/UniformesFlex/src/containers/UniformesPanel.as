/**
 * Created by othoniel on 5/5/14.
 */
package containers {
import spark.components.Group;
import spark.components.Image;
import spark.components.Panel;

public class UniformesPanel extends Panel {
    [SkinPart(required="true")]
    public var menuGroup:Group;

    [SkinPart(required="true")]
    public var politicasImage:Image;

    [SkinPart]
    public var infoGroup:Group;

    private var _menuContent:Array = [];
    private var _infoContent:Array = [];

    public function UniformesPanel() {
        super();
    }

    [ArrayElementType("mx.core.IVisualElement")]
    public function get menuContent():Array {
        return _menuContent;
    }

    public function set menuContent(value:Array):void {
        _menuContent = value;
        if (menuGroup) {
            menuGroup.mxmlContent = value;
        }
    }

    [ArrayElementType("mx.core.IVisualElement")]
    public function get infoContent():Array {
        return _infoContent;
    }

    public function set infoContent(value:Array):void {
        _infoContent = value;
    }

    override protected function partAdded(partName:String, instance:Object):void {
        super.partAdded(partName, instance);

        if (instance == menuGroup) {
            menuGroup.mxmlContent = _menuContent;
        }
        if (instance == infoGroup) {
            infoGroup.mxmlContent = _infoContent;
        }
    }

    override protected function partRemoved(partName:String, instance:Object):void {
        super.partRemoved(partName, instance);

        if (instance == menuGroup) {
            menuGroup.mxmlContent = null;
        }
        if (instance == infoGroup) {
            infoGroup.mxmlContent = null;
        }
    }
}
}
