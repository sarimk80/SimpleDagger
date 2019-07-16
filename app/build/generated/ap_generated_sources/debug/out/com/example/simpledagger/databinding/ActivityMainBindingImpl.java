package com.example.simpledagger.databinding;
import com.example.simpledagger.R;
import com.example.simpledagger.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.User == variableId) {
            setUser((com.example.simpledagger.model.UserModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.example.simpledagger.model.UserModel User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.User);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userCompanyCatchPhrase = null;
        com.example.simpledagger.model.UserModel user = mUser;
        java.lang.String userAddressCity = null;
        java.lang.String userPhone = null;
        com.example.simpledagger.model.Address userAddress = null;
        java.lang.String userUsername = null;
        com.example.simpledagger.model.Company userCompany = null;
        java.lang.String userName = null;
        java.lang.String userCompanyName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read User.phone
                    userPhone = user.getPhone();
                    // read User.address
                    userAddress = user.getAddress();
                    // read User.username
                    userUsername = user.getUsername();
                    // read User.company
                    userCompany = user.getCompany();
                    // read User.name
                    userName = user.getName();
                }


                if (userAddress != null) {
                    // read User.address.city
                    userAddressCity = userAddress.getCity();
                }
                if (userCompany != null) {
                    // read User.company.catchPhrase
                    userCompanyCatchPhrase = userCompany.getCatchPhrase();
                    // read User.company.name
                    userCompanyName = userCompany.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, userAddressCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userCompanyName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userCompanyCatchPhrase);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): User
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}