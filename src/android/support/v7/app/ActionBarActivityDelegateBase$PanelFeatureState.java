package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.style;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter.Callback;
import android.support.v7.internal.view.menu.MenuView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

final class ActionBarActivityDelegateBase$PanelFeatureState
{
  ViewGroup decorView;
  int featureId;
  Bundle frozenActionViewState;
  Bundle frozenMenuState;
  boolean isHandled;
  boolean isOpen;
  boolean isPrepared;
  ListMenuPresenter listMenuPresenter;
  Context listPresenterContext;
  MenuBuilder menu;
  public boolean qwertyMode;
  boolean refreshDecorView;
  boolean refreshMenuContent;
  View shownPanelView;
  boolean wasLastOpen;
  
  ActionBarActivityDelegateBase$PanelFeatureState(int paramInt)
  {
    featureId = paramInt;
    refreshDecorView = false;
  }
  
  final void applyFrozenState()
  {
    if ((menu != null) && (frozenMenuState != null))
    {
      menu.restorePresenterStates(frozenMenuState);
      frozenMenuState = null;
    }
  }
  
  public final void clearMenuPresenters()
  {
    if (menu != null) {
      menu.removeMenuPresenter(listMenuPresenter);
    }
    listMenuPresenter = null;
  }
  
  final MenuView getListMenuView(MenuPresenter.Callback paramCallback)
  {
    if (menu == null) {
      return null;
    }
    if (listMenuPresenter == null)
    {
      listMenuPresenter = new ListMenuPresenter(listPresenterContext, R.layout.abc_list_menu_item_layout);
      listMenuPresenter.setCallback(paramCallback);
      menu.addMenuPresenter(listMenuPresenter);
    }
    return listMenuPresenter.getMenuView(decorView);
  }
  
  public final boolean hasPanelItems()
  {
    if (shownPanelView == null) {}
    while (listMenuPresenter.getAdapter().getCount() <= 0) {
      return false;
    }
    return true;
  }
  
  final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (ActionBarActivityDelegateBase.PanelFeatureState.SavedState)paramParcelable;
    featureId = featureId;
    wasLastOpen = isOpen;
    frozenMenuState = menuState;
    shownPanelView = null;
    decorView = null;
  }
  
  final Parcelable onSaveInstanceState()
  {
    ActionBarActivityDelegateBase.PanelFeatureState.SavedState localSavedState = new ActionBarActivityDelegateBase.PanelFeatureState.SavedState(null);
    featureId = featureId;
    isOpen = isOpen;
    if (menu != null)
    {
      menuState = new Bundle();
      menu.savePresenterStates(menuState);
    }
    return localSavedState;
  }
  
  final void setMenu(MenuBuilder paramMenuBuilder)
  {
    if (paramMenuBuilder == menu) {}
    do
    {
      return;
      if (menu != null) {
        menu.removeMenuPresenter(listMenuPresenter);
      }
      menu = paramMenuBuilder;
    } while ((paramMenuBuilder == null) || (listMenuPresenter == null));
    paramMenuBuilder.addMenuPresenter(listMenuPresenter);
  }
  
  final void setStyle(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    Resources.Theme localTheme = paramContext.getResources().newTheme();
    localTheme.setTo(paramContext.getTheme());
    localTheme.resolveAttribute(R.attr.actionBarPopupTheme, localTypedValue, true);
    if (resourceId != 0) {
      localTheme.applyStyle(resourceId, true);
    }
    localTheme.resolveAttribute(R.attr.panelMenuListTheme, localTypedValue, true);
    if (resourceId != 0) {
      localTheme.applyStyle(resourceId, true);
    }
    for (;;)
    {
      paramContext = new ContextThemeWrapper(paramContext, 0);
      paramContext.getTheme().setTo(localTheme);
      listPresenterContext = paramContext;
      return;
      localTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase.PanelFeatureState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */