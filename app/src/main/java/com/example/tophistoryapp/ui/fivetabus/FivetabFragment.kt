package com.example.tophistoryapp.ui.fivetabus

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.tophistoryapp.databinding.FragmentFifthTabBinding


class FivetabFragment : Fragment() { // Добавляем наследование от Fragment
    private var _binding: FragmentFifthTabBinding? = null // Используем правильное имя класса Binding
    private val binding get() = _binding!!

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFifthTabBinding.inflate(inflater, container, false) // Используем правильное имя класса Binding
        val view = binding.root

        // Настройка WebView
        binding.webview.apply {
            webViewClient = WebViewClient() // Устанавливаем WebViewClient для внутренней навигации
            settings.javaScriptEnabled = true // Включаем поддержку JavaScript

            val htmlContent = """
    <html>
    <head>
        <style>
            body { font-family: 'Arial', sans-serif; line-height: 1.6; padding: 16px; background-color: #DCC18D; color: #000000; }
            h1 { color: ##000000; }
            ul { list-style: none; padding: 0; }
            li { margin: 8px 0; }
            a { text-decoration: none; color: #4e8ef7; }
            a:hover { text-decoration: underline; }
        </style>
    </head>
    <body>
    <h1>Источники информации</h1>
    <ul>
        <li style="font-weight: bold; font-size: 24px;">Улица Аблукова</li>
        <li>[1].  Герои - ульяновцы в боях за Родину : краткий биографический словарь / редкол.: В. Л. Табакин [и др.] – Ульяновск : Дом печати, 2000. – С. 104. </li>
        <li>[2].  Город Ильича в названиях улиц: библиографический указатель литературы / сост. О. А. Кучерова, Н. А. Самойлова – Ульяновск : Ульяновская областная библиотека – Дворец книги имени В. И.Ленина. Информационно-библиографический отдел, 1990. – С. 8.</li>
        <li>[3].  Кочнев, В. Я. Друг Матросова – Аблуков / В. Я. Кочнев. – Саратов: Приволжское книжное издательство, 1988.; 96 с.</li>
        <li>[4].  Симбирск-Ульяновск : Улицы города, их прошлое и настоящее : справочник / Администрация Ульяновской области. – Ульяновск : Ульяновское государственное предприятие технической инвентаризации, 1998. – С. 40.</li>
        <li>[5].  Иванов, С. Их имена - в названиях улиц : [Аблуков Александр Михайлович] / С. Иванов // Ульяновск сегодня. – 2017. – № 6 (27 янв.). – С. 12.</li>
        <li>[6].  Кочнев, В. Я. Клятва бойцов / В. Я. Кочнев // Ульяновская правда. –1982. – 12 янв.\</li>
        <li>[7].  Кочнев, В. Я. Огни и воды / В. Я. Кочнев // Ульяновский комсомолец. – 1983. – 19 янв.</li>
        <li>[8].  Филатов, А. Он был воином, поэтом, рабочим / А. Филатов // Ульяновская неделя. – 1978. – № 22 (2-8 июня).</li>
        <li</li>
        <li style="font-weight: bold; font-size: 24px;">Улица Алашеева</li>
        <li>[1].  Бендерова, В. Н. След на земле / В. Н. Бендерова. –&nbsp; Москва : Молодая гвардия, 1965. – 188 с.</li>
        <li>[2].  Васин, В. П. Испытатели ЛИИ / В. П. Васин, А. А. Симонов.&nbsp;— Жуковский : Авиационный Печатный Двор, 2001. 54 с.</li>
        <li>[3].  Герои Советского Союза : краткий биографический словарь / пред. ред. коллегии И. Н. Шкадов.&nbsp;— Москва : Воениздат, 1987.&nbsp;— Т.&nbsp;1. Абаев — Любичев. С. 37-38</li>
        <li>[4].  Герои - ульяновцы в боях за Родину : краткий биографический словарь / редкол. : В.Л. Табакин [и др.] – Ульяновск : Дом печати, 2000. – С. 30.</li>
        <li>[5].  Город Ильича в названиях улиц : библиографический указатель литературы. – Ульяновск, 1990. – С. 8-9.</li>
        <li>[6].  Ермолаев, А. Шагнувшие в бессмертие. Герои Советского Союза – ульяновцы / А. Ермолаев, Н. Калашников. – Ульяновск : Симбирская книга, 1994. – С. 14.</li>
        <li>[7].  Кербер, Л. Л. ТУ – человек и самолёт / Л. Л. Кербер. – Москва : Советская Россия, 1973. – С. 223, 247.</li>
        <li>[8].  Симбирск-Ульяновск : Улицы города, их прошлое и настоящее : справочник / Администрация Ульяновской области. – Ульяновск : Ульяновское государственное предприятие технической инвентаризации, 1998. – С. 40.</li>
        <li>[9].  Фомин, Л. Город Инза / Л. Фомин. – Саратов : Приволжское книжное издательство. Ульяновское отделение, 1979. – С. 57, 59-60.</li>
        <li>[10]. Долгов, О. «Сбей пламя, уйди в облака – я прикрою!..» : [о Герое Советского Союза Ю.Т. Алашееве] / О. Долгов. – Ульяновская правда. – 2010. – 5 февраля. – С. 6.</li>
        <li>[11]. Еварестова, А. Улица имени Ю. Т. Алашеева / А. Еварестова // Ульяновская неделя. – 1974. – №33 (17-23 августа). – С.3.</li>
        <li</li>
        <li style="font-weight: bold; font-size: 24px;">Улица Гастелло</li>
        
        
        
        <!-- Добавьте дополнительные источники здесь -->
    </ul>
    </body>
    </html>
""".trimIndent()

            loadDataWithBaseURL(null, htmlContent, "text/html", "utf-8", null)
        }// Загружаем URL



        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Очищаем ссылку на Binding при уничтожении View
    }

}