package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnCloseListener;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.EditText;
import android.widget.TextView;

public class StatefulSearchView
  extends SearchView
  implements SearchView.OnCloseListener, SearchView.OnQueryTextListener, View.OnLayoutChangeListener
{
  private boolean a = true;
  private SearchView.OnQueryTextListener b;
  private String c;
  private SearchView.OnCloseListener d;
  private boolean e = true;
  
  public StatefulSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    addOnLayoutChangeListener(this);
    super.setOnCloseListener(this);
  }
  
  public boolean onClose()
  {
    if (!e)
    {
      c = null;
      e = false;
    }
    if (d == null) {
      return false;
    }
    return d.onClose();
  }
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if ((super.isIconfiedByDefault()) || ((!super.isIconified()) && (!TextUtils.isEmpty(c)) && (a)))
    {
      paramView = c;
      super.setOnQueryTextListener(null);
      if (paramView != null)
      {
        TextView localTextView = (TextView)findViewById(getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        localTextView.setText(paramView);
        if (!TextUtils.isEmpty(paramView)) {
          ((EditText)localTextView).setSelection(paramView.length());
        }
      }
      super.setOnQueryTextListener(b);
    }
  }
  
  public boolean onQueryTextChange(String paramString)
  {
    c = paramString;
    return b.onQueryTextChange(c);
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    return b.onQueryTextSubmit(paramString);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (StatefulSearchView.SearchQueryState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    c = paramParcelable.b();
    a = paramParcelable.a();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    return new StatefulSearchView.SearchQueryState(this, super.onSaveInstanceState(), c, a);
  }
  
  public void setIconified(boolean paramBoolean)
  {
    c = getQuery().toString();
    super.setOnCloseListener(null);
    super.setIconified(paramBoolean);
    super.setIconified(paramBoolean);
    super.setOnCloseListener(this);
    e = true;
  }
  
  public void setOnCloseListener(SearchView.OnCloseListener paramOnCloseListener)
  {
    d = paramOnCloseListener;
    super.setOnCloseListener(this);
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.StatefulSearchView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */