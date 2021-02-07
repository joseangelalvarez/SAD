package com.example.sad.Contratos;

import android.provider.BaseColumns;

public class EmpresaContrato {
    public static abstract class EmpresaEntrada implements BaseColumns{
        public static final String TABLE_NAME="empresa";
        public static final String ID="id";
        public static final String NOMBRE="nombre";
        public static final String DIRECCION="direccion";
        public static final String LOCALIDAD="localidad";
        public static final String NIF="nif";
        public static final String TELEFONO="telefono";
    }
}
