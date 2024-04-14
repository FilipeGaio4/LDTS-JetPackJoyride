package jetpack.Viewer.Background;

import jetpack.GUI.GUI;
import jetpack.Model.Game.elements.Element;
public interface ElementViewer<T extends Element> { void draw(T element, GUI gui);}
